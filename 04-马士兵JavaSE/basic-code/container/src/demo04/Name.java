package demo04;

/**
 * @Author 李明
 * @Date 2022/1/9  22:29
 **/


class Name {
    private String firstName,lastName;
    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + "" + lastName ;
    }

    //2个对象如果equals的话，两个对象的hashcode应该相等
    //容器类对象在调用remove,contains等方法时需要比较对象是否相等，这会涉及到对象类型的equals方法和hashCode方法
    //对于自定义的类型，需要重写equals和hashCode方法以实现自定义的对象相等规则
    //TODO:注意：相等的对象应该具有相等的hashCodes
    //增加Name类的equals和hashCode方法如下：
    public boolean equals(Object obj){
        if(obj instanceof Name){
            Name name = (Name) obj;
            return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
        }
        return super.equals(obj);
        //总之：重写equals方法，应该重写hashCode方法
    }

    public int hashCode(){
        return firstName.hashCode();
    }
    //当你这个对象作为索引的时候，用hashCode比较多
}
