package app

import app.brj.BackgroundReloaderJob
import app.config.Environment
import app.controller.PriceController
import app.module.ProductionModule
import app.module.TestModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.google.inject.Module
import io.jooby.Kooby
import io.jooby.di.GuiceModule
import io.jooby.json.JacksonModule
import io.jooby.quartz.QuartzModule
import io.jooby.runApp
import java.lang.Exception

val Kooby.guiceModule: Module
  get() =
    try {
      when(config.getString(Environment.CONFIG_KEY)) {
        Environment.PRODUCTION -> ProductionModule
        else                   -> TestModule
      }
    } catch (_: Exception) {
      TestModule
    }

class App : Kooby({
  environmentOptions {
    filename = "application.properties"
  }

  // Modules
  install(GuiceModule(guiceModule))
  install(QuartzModule(BackgroundReloaderJob::class.java))
  install(JacksonModule().module(KotlinModule::class.java))

  coroutine {
    get("/price") {
      val priceController = require(PriceController::class.java)
      priceController.get(ctx)
    }
  }
})

fun main(args: Array<String>) {
  runApp(args, App::class)
}
