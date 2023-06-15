package org.comstudy21.saram.model;

public class SaramDTO {
   // Database�� Table�� ���� �ʵ带 �����.
   private String id;
   private String name;
   private int age;
   
   public SaramDTO() {
      this("","",0);
   }

   public SaramDTO(String id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
   }
   
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "SaramDTO [id=" + id + ", name=" + name + ", age=" + age + "]";
   }
}