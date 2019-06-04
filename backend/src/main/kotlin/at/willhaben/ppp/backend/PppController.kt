package at.willhaben.ppp.backend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v2")
class PppController {

    @GetMapping("/weeks")
    fun getWeekList(): List<String> {
        return listOf("2019-22", "2019-21", "2019-20", "2019-19", "2019-18", "2019-17", "2019-16", "2019-15", "2019-14", "2019-13", "2019-12", "2019-11", "2019-10", "2019-09", "2019-08", "2019-07", "2019-06", "2019-05", "2019-04", "2019-03", "2019-02", "2019-01", "2018-51", "2018-50", "2018-49", "2018-48", "2018-47", "2018-46", "2018-45", "2018-44", "2018-43", "2018-42", "2018-41", "2018-40", "2018-39", "2018-38", "2018-37", "2018-36", "2018-35", "2018-34", "2018-33", "2018-32", "2018-31")
    }

    @GetMapping("/weeks/{week}")
    fun getWeek(@PathVariable week: String): List<Item> {
        return listOf(
                Item(
                        "01c5d650-8209-11e9-b56d-f1188edd9219",
                        ItemData(1559131080757, "web", "test", "progress")
                ))
    }

    data class Item(val uuid: String, val data: ItemData)
    data class ItemData(val order: Long, val team: String, val text: String, val type: String)

}