
    public abstract class Book{
        private String code;
        private String name;
        private int price;
        private String author;

        public Book() {
        }

        public Book(String code, String name, int price, String author) {
            this.code = code;
            this.name = name;
            this.price = price;
            this.author = author;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", author='" + author + '\'' +
                    '}';
        }
        //ban mo ta: chua dc xac dinh
//   chi co ten, kieu du lieu, co tham so khong co phan trien khai
//    pt abstract khong co phan phan
//    Tao ban thiet ke => Phai trien khai lai
        public abstract double getAMount();


    }

