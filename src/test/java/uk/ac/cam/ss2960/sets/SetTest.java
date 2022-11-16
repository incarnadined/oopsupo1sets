package uk.ac.cam.ss2960.sets;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SetTest {

  @Test
  public void searchSetInsertElement() {
    // ARRANGE
    SearchSet set = new SearchSet();

    // ACT
    set.insert(5);
    set.insert(3);
    set.insert(4);
    set.insert(6);
    set.insert(2);

    // ASSERT
    assertThat(set.getNumberElements()).isEqualTo(5);
  }

  @Test
  public void searchSetGet() {
    // ARRANGE
    SearchSet set = new SearchSet();

    // ACT
    set.insert(5);
    set.insert(3);
    set.insert(4);
    set.insert(6);
    set.insert(2);

    // ASSERT
    assertThat(set.contains(1)).isFalse();
    assertThat(set.contains(2)).isTrue();
  }
}
