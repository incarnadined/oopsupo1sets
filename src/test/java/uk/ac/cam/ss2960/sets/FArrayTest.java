package uk.ac.cam.ss2960.sets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class FArrayTest {
  @Test
  public void FArraySetGet() {
    // ARRANGE
    FunctionalArray fa = new FunctionalArray(5);

    // ACT
    fa.set(0, 9);
    fa.set(1, 8);
    fa.set(2, 7);
    fa.set(3, 6);
    fa.set(4, 5);

    // ASSERT
    assertThat(fa.get(2)).isEqualTo(7);
    assertThat(fa.get(0)).isEqualTo(9);
    assertThat(fa.get(3)).isEqualTo(6);
    assertThat(fa.get(4)).isEqualTo(5);
    assertThat(fa.get(1)).isEqualTo(8);
  }

  @Test (expected = ArrayIndexOutOfBoundsException.class)
  public void FArrayOutOfBounds() {
    // ARRANGE
    FunctionalArray fa = new FunctionalArray(5);

    // ACT

    // ASSERT
    fa.get(2);
  }
}
