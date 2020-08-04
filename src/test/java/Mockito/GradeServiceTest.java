package Mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    private GradeSystem gradeSystem;
    private GradeService gradeService;

    @BeforeEach
    void setUp() {
        gradeSystem = mock(GradeSystem.class);
        gradeService = new GradeService(gradeSystem);
        when(gradeSystem.gradesFor(1)).thenReturn(Arrays.asList(90.0,80.0,100.0));
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = gradeService.calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
}
