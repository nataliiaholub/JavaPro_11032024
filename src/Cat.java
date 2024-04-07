public class Cat implements Participant{

     private String name;

     private boolean eliminated;

     public Cat(String name) {
         this.name = name;
     }

        @Override
        public void run() {
            System.out.println("Cat " + name + " is running!");
        }

        @Override
        public void jump() {
            System.out.println("Cat " + name + " is jumping!");
        }

        @Override
        public boolean isEliminated() {
            return eliminated;
        }

        public void setEliminated(boolean eliminated) {
            this.eliminated = eliminated;
        }
        @Override
        public String getName() {
            return name;
    }


}
