package com.company;

public class Main {

    public interface transport{
        void move();
        void fuel();
    }

    public abstract class water implements transport{
        @Override
        public void move () {System.out.println("Плывёт");}
        @Override
        public abstract void fuel();
    }

    public abstract class air implements transport{
        @Override
        public void move () {System.out.println("Летит");}
        @Override
        public abstract void fuel();
    }

    public abstract class ground implements transport{
        @Override
        public void move () {System.out.println("Едет");}
        @Override
        public abstract void fuel();
    }

    public class Boat extends water{                                     //Катер
        @Override
        public void fuel() {System.out.println("Бензин");}
        private class extra{
            private int Vmestomost;
            float height, weight;
            private extra (int Vmestomost, float height, float weight){
                this.Vmestomost = Vmestomost;
                this.height = height;
                this.weight = weight;
            }
        }
    }

    public class ElectricParom extends water{                            //Электический паром
        @Override
        public void fuel() {System.out.println("Электричество");}
    }

    public class Steamship extends water{                                //Пароход
        @Override
        public void fuel() {System.out.println("Уголь");}
    }

    public class TurbojetAircraft extends air {                          //ТРБ самолёт
        @Override
        public void fuel() {System.out.println("Керосин");}

        private class wing {
            private  String color, model;
            private wing(String color,String model){
                this.color = color;
                this.model = model;
            }
        }
    }

    public class ElectricAircraft extends air{                           //Электрический самолёт
        @Override
        public void fuel() {System.out.println("Электричество");}
    }

    public class Helicopter extends air{                                 //Вертолёт
        @Override
        public void fuel() {System.out.println("Горючее");}
    }

    public class Car extends ground{                                     //Автомобиль
        @Override
        public void fuel() {System.out.println("Бензин");}

        private class door{
            private String color, privod;
            private door(String color, String privod){
                this.color = color;
                this.privod = privod;
            }
        }
    }

    public class ElectricCar extends ground{                             //Электрический автомобиль
        @Override
        public void fuel() {System.out.println("Электричество");}
    }

    public class Locomotive extends ground{                              //Паровоз
        @Override
        public void fuel() {System.out.println("Уголь");}
    }

    public static void main(String[] args) {

    }
}
