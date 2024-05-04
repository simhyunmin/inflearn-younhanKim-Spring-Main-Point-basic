package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//스프링 컨테이너에서 스프링 빈을 찾는 가장 기본적인 조회 방법
//ac.getBean(빈이름, 타입)
//ac.getBean(타입)
class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();  //bean에 등록된 이름을 다 정리하는 과정
        for (String beanDefinitionName : beanDefinitionNames) {  //'iter'+Enter를 통해 리스트나 배열이 있으면 자동으로 for문을 만들어준다.
            Object bean = ac.getBean(beanDefinitionName);  //ApplicationContext에서 bean 꺼내기 다만, 타입이 불분명하므로 Object로 지정
            System.out.println("beanDefinitionName  = " + beanDefinitionName + " object = " + bean); //soutv 하면 변수가 있으면 자동으로 변수명을 찍어준다.
                                                                                                     //beanDefinitionName 과 bean을 차례로 찍어주면 완성
        }                                                                                            //beanDefinitionName이 핵심이다.
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            //Role ROLE_APPLICATION: 직접 등록한 애플리케이션 빈
            //Role ROLE_INFRASTRUCTURE: 스프링이 내부에서 사용하는 빈
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){   //애플리케이션에서 주로 사용하기 위해 등록한 빈들
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("beanDefinitionName  = " + beanDefinitionName + " object = " + bean);

            }



        }
    }


}
