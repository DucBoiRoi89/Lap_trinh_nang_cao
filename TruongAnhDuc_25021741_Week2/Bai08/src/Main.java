class Main{
    public static void main(String[] args){
        Person p = new Person("Person 1");
        p.setMe(p);
        System.out.println(p.getMe().getName());
        p = null;
    }
}