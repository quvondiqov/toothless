import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Toothless_bot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        if (update.getMessage()!=null && update.getMessage().hasText()) {
            long chat_id = update.getMessage().getChatId();

            try {
                execute(new SendMessage(chat_id," Salom "+"\t"+update.getMessage().getText()));
            }catch (TelegramApiException e){
                e.printStackTrace();
            }
        }



    }

    public String getBotUsername() {
        return "toothless_bot";
    }

    public String getBotToken() {
        return "1136010186:AAFsWzj3aksZlZtyBjVctBYkLAzamTZdjOk";
    }
}
