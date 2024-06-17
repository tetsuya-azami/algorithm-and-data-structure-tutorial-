import java.util.Scanner

class Chapter1 {
       companion object{
           // answerを見つけるまでにかかる回数を計算
           fun numberOfTimesToFindAnswer(): Int{
               val list = (20..35).toList().sorted()
               var first = 0
               var last = list.size - 1

               val scanner = Scanner(System.`in`)
               val answer = scanner.nextInt()

               var count = 0
               do{
                   count++
                   val middle = (first + last) / 2
                   if (answer == list[middle]){
                       return count
                   }
                   if (answer < list[middle]){
                       last = middle - 1
                   }
                   if (list[middle] < answer){
                       first = middle + 1
                   }
               } while (first <= last)
               throw IllegalArgumentException("$answer が見つかりませんでした。")
           }
       }
}