package com.tasneembohra.github

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.tasneembohra.github.repo.Repository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner.Silent::class)
@ExperimentalCoroutinesApi
class ArticleViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()

    @Mock
    private lateinit var repo: Repository

    @Before
    fun setup() {
    }


}