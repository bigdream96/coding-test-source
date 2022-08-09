from unittest import TestCase, main
import solution


class MyTests(TestCase):
    def test(self):
        k = 80
        dungeons = [[80, 20], [50, 40], [30, 10]]

        answer = solution.solution(k, dungeons)

        self.assertEqual(answer, 3)


if __name__ == '__main__':
    main()
