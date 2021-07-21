package com.appt.feature1

import com.appt.shared.User
import com.appt.shared.createTestUser
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val user = createTestUser()
        assertEquals(User(true), user)
    }
}