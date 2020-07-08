package app.service

import app.brj.BackgroundReloadable
import app.model.Item
import app.store.ItemStore
import javax.inject.Inject
import javax.inject.Singleton

interface ItemService {
    suspend fun getAll(ids: Set<String>): Set<Item>
}

@Singleton
class ItemServiceImpl: ItemService, BackgroundReloadable {
    private var items = setOf<Item>()
    @Inject private lateinit var store: ItemStore

    override suspend fun load() {
        this.items = store.all()
    }

    override suspend fun getAll(ids: Set<String>): Set<Item> = items
            .filterTo(HashSet()) { it.id in ids }
}