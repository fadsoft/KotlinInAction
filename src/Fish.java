public class Fish {
        private int size;
        private boolean hungry;

        public Fish(int size, boolean isHungry){
            this.size = size;
            this.hungry = isHungry;

        }

        public int getSize(){
            return size;
        }

        public void setSize(int size){
            this.size = size;
        }

        public boolean isHungry(){
            return hungry;
        }

        public void setHungry(boolean hungry){
            this.hungry = hungry;
        }

}
