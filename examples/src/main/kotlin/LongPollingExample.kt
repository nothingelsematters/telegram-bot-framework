import com.github.elbekD.bot.Bot

fun main(args: Array<String>) {
    val token = "439178594:AAFna-4TIFOaTmhuvUlaCvuszlBKyZa2a_4"
    val bot = Bot.createPolling(token) {
        // below is optional parameters
        // limit = 50
        // timeout = 30
        // allowedUpdates = listOf(AllowedUpdates.Message)
        // removeWebhookAutomatically = true
        // period = 1000
    }

    bot.onCommand("/start") { msg, _ ->
        bot.sendMessage(msg.chat.id, "Hello World!")
    }

    bot.onCommand("/echo") { msg, opts ->
        bot.sendMessage(msg.chat.id, "${msg.text} ${opts ?: ""}")
    }

    bot.start()
}