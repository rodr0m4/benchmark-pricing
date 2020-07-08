package app.brj

import app.service.DiscountServiceImpl
import app.service.ItemServiceImpl
import app.service.PaymentMethodServiceImpl
import app.service.UserServiceImpl
import io.jooby.quartz.QuartzModule
import io.jooby.quartz.Scheduled
import kotlinx.coroutines.*
import org.quartz.Job
import org.quartz.JobExecutionContext
import java.lang.Runnable
import java.util.concurrent.Executors
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.minutes

@Singleton
class BackgroundReloaderJob @Inject constructor(
    itemServiceImpl: ItemServiceImpl,
    discountServiceImpl: DiscountServiceImpl,
    paymentMethodServiceImpl: PaymentMethodServiceImpl,
    userServiceImpl: UserServiceImpl
): Job {
    private val jobs = listOf(
        itemServiceImpl,
        discountServiceImpl,
        paymentMethodServiceImpl,
        userServiceImpl
    )

    @Scheduled("1m")
    override fun execute(context: JobExecutionContext?) {
        runBlocking {
            jobs.map { async { it.load() } }.awaitAll()
        }
    }
}