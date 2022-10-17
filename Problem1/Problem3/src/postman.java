import java.util.Objects;

public class postman{
    /**
    Интерфейс: сущность, которую можно отправить по почте.
    У такой сущности можно получить от кого и кому направляется письмо.
    */
    public static interface Sendable {
        String getForm();
        String getTo();
    }
    /**
     Абстрактный класс, который позволяет абстрагировать логику хранения
     источника и получателя письма в соответствующих полях класса.
     Класс реализует логику методов из интерфейса
     */
    public static abstract class AbstractSendable implements Sendable {
        protected final String from;//текстовое поле откуда пришло
        protected final String to;//текстовое поле кому отравим

        //конструктор
        protected AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }
        //получалки
        @Override
        public String getForm() {
            return from;
        }
        @Override
        public String getTo() {
            return to;
        }
        //переопределяем класс equals, для сравнения двух писем
        @Override
        public boolean equals(Object obj) {
            if (this == obj){return true;}
            if (obj == null||this.getClass()!=obj.getClass()){
                return false;
            }
            AbstractSendable that = (AbstractSendable) obj;

            if (!from.equals(that.from))return false;
            if (!to.equals(that.to))return false;

            return true;
        }
    }
    /**
     Класс описывает текстовое поле, то есть класс
     которые определяет что будет написано в письме
     Письмо, у которого есть текст, который можно получить
     с помощью метода `getMessage`

     Первый класс описывает обычное письмо, в котором
     находится только текстовое сообщение.
     */
    public static class MailMessage extends AbstractSendable{
        private final String message;
        //конструктор с предопределенными from и to
        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;
            //пиздец странное переопределение
            if (message != null
                    ? !message.equals(that.message)
                    : that.message != null) return false;
            return true;
        }
    }
    /**
     Класс описывает почтовую посылку
     Посылка, содержимое которой можно получить с помощью метода `getContent`
     */
    public static class MailPackage extends AbstractSendable{
        private final Package content;
        protected MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }
        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MailPackage)) return false;
            if (!super.equals(o)) return false;
            MailPackage that = (MailPackage) o;
            if (!content.equals(that.content)) return true;
            return content.equals(that.content);
        }

        @Override
        public int hashCode() {
            return Objects.hash(content);
        }
    }
    /**
     При этом сам Package описывается другим классом
     Класс, который задает посылку.
     У посылки есть текстовое описание содержимого и целочисленная ценность.
     */
    public static class Package{
        private final String content;
        private final int price;
        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }
        public int getPrice() {
            return price;
        }
        public String getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Package)) return false;
            Package aPackage = (Package) o;
            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;
            return true;
        }
    }
    /**
    Интерфейс, который задает класс, который может
     каким-либо образом обработать почтовый объект.
    */
    public static interface MailService{
        Sendable processMail(Sendable mail);
    }
    /**
    Класс, в котором скрыта логика настоящей почты
    */
    public static class RealMailService implements MailService{
        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.

            return mail;
        }
    }
    /**
     UntrustworthyMailWorker класс, моделирующий
     ненадежного работника почты, который вместо того,
     чтобы передать почтовый объект непосредственно в сервис почты,
     последовательно передает этот объект набору третьих лиц, а затем,
     в конце концов, передает получившийся объект непосредственно экземпляру
     RealMailService. У UntrustworthyMailWorker должен быть конструктор
     от массива MailService (результат вызова processMail
     первого элемента массива передается на вход processMail
     второго элемента, и т. д.) и метод getRealMailService,
     который возвращает ссылку на внутренний экземпляр
     RealMailService.
     */
    public static class UntrustworthyMailWorker extends RealMailService implements MailService{

    }


}






























