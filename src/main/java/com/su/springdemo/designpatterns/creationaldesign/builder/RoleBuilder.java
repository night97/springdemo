package com.su.springdemo.designpatterns.creationaldesign.builder;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.builder
 * @ClassName: RoleBuilder
 * @Author:night
 * @Description:变种的builder
 * @Date:2019/6/29 16:27
 */
public class RoleBuilder {

    private  String head;

    private  String face;

    private  String body;

    private  Double hp;

    private  Double sp;

    private  Double mp;

    private RoleBuilder(Builder builder) {
        this.body = builder.body;
        this.face = builder.face;
        this.head = builder.head;
        this.hp = builder.hp;
        this.sp = builder.sp;
        this.mp = builder.mp;
    }

    @Override
    public String toString() {
        return "RoleBuilder{" +
                "head='" + head + '\'' +
                ", face='" + face + '\'' +
                ", body='" + body + '\'' +
                ", hp=" + hp +
                ", sp=" + sp +
                ", mp=" + mp +
                '}';
    }

    public static class Builder{
        private String head;

        private String face;

        private String body;

        private Double hp;

        private Double sp;

        private Double mp;

        public Builder (String head) {
            this.head = head;
        }

        public Builder head(final String head) {
            this.head = head;
            return this;
        }

        public Builder face(String face) {
            this.face = face;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder sp(Double sp) {
            this.sp = sp;
            return this;
        }

        public Builder hp(Double hp) {
            this.hp = hp;
            return this;
        }

        public Builder mp(Double mp) {
            this.mp = mp;
            return this;
        }

        public RoleBuilder build() {
            return new RoleBuilder(this);
        }
    }
}
