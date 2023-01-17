

data class Post(
    val id : Int,
    val ownerId : Int,
    val fromId : Int,
    val date : Int,
    val replyPostId : Int,
    val postType : String,
    val text : String,
    val friendsOnly : Boolean,
    val comment: comment,
    val likes: likes
)
object WallService {
    private var posts = emptyArray<Post>()
    private var id = 0

    fun add(post: Post): Post {
        id++
        val postId = post.copy(id = id)
        posts += postId
        return posts.last()
    }

    fun print() {
        for (post in posts)
            println(post)
    }

    fun update(post: Post): Boolean {
    for ((index, post2) in posts.withIndex()) {
        when {
            post2.id.equals(post.id) -> {
                println("found id in array with index: $index")
                val postUpdate = post.copy(ownerId = post2.ownerId, date = post2.date)
                posts.set(index, postUpdate)
                return true
            }

        }
    }
    return false
}
}
//count (integer) — количество комментариев;
//can_post* (boolean) — информация о том, может ли текущий пользователь комментировать запись;
//groups_can_post (boolean) — информация о том, могут ли сообщества комментировать запись;
//can_close(boolean) — может ли текущий пользователь закрыть комментарии к записи;
//can_open(boolean) — может ли текущий пользователь открыть комментарии к записи.
class comment(
    counts: Int = 0,
    var canPost: Boolean = true,
    var groupsCanPost: Boolean = true,
    var canClose: Boolean = true,
    var canOpen: Boolean = true
){
    var counts = counts
        set(value){
            if (value < 0)
                return
            field = value
        }

    override fun toString(): String {
        return " counts = $counts, canPost = $canPost, groupsCanPost = $groupsCanPost, canClose = $canClose, canOpen = $canOpen"
    }
}
//count (integer) — число пользователей, которым понравилась запись;
//user_likes* (boolean) — наличие отметки «Мне нравится» от текущего пользователя;
//can_like* (boolean) — информация о том, может ли текущий пользователь поставить отметку «Мне нравится»;
//can_publish* (boolean) — информация о том, может ли текущий пользователь сделать репост записи.
class likes(
    counts: Int = 0,
    var userLikes: Boolean = true,
    var canLike: Boolean = true,
    var canPublish: Boolean = true
){
    var counts = counts
        set(value){
            field = if (value >= 0)
                value
            else
                0
        }

    override fun toString(): String {
        return " counts = $counts,userLikes = $userLikes, canLike = $canLike, canPublish = $canPublish"
    }
}


fun main() {
    val com = comment()
    val like = likes()
    like.counts = -4
    com.counts = - 10
    val post1 = Post(1, 123,321, 211221, 111, "Nature","Advanture in the forest",true,
    com, like)
    val post2 = Post(1, 123,321, 211221, 111, "Since","News from space",true,
        com, like)
    val post3 = Post(1, 123,321, 211221, 111, "Medicine","Health to everyone",true,
        com, like)
    val post4 = Post(3, 321,123, 217221, 151, "Update","ggg",true,
        com, like)
    WallService.add(post1)
    WallService.add(post2)
    WallService.add(post3)
    WallService.print()
    WallService.update(post4)
    WallService.print()



}