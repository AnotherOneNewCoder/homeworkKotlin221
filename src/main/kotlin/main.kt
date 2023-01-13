
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
    val likes: likes,
)
object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }
}
//count (integer) — количество комментариев;
//can_post* (boolean) — информация о том, может ли текущий пользователь комментировать запись;
//groups_can_post (boolean) — информация о том, могут ли сообщества комментировать запись;
//can_close(boolean) — может ли текущий пользователь закрыть комментарии к записи;
//can_open(boolean) — может ли текущий пользователь открыть комментарии к записи.
class comment(
    count: Int = 0,
    var canPost: Boolean = true,
    var groupsCanPost: Boolean = true,
    var canClose: Boolean = true,
    var canOpen: Boolean = true,
){
    var counts = count
        set(value){
            if (value < 0)
                return
            field = value
        }
}
//count (integer) — число пользователей, которым понравилась запись;
//user_likes* (boolean) — наличие отметки «Мне нравится» от текущего пользователя;
//can_like* (boolean) — информация о том, может ли текущий пользователь поставить отметку «Мне нравится»;
//can_publish* (boolean) — информация о том, может ли текущий пользователь сделать репост записи.
class likes(
    count: Int = 0,
    var userLikes: Boolean = true,
    var canLike: Boolean = true,
    var canPublish: Boolean = true
){
    var counts = count
        set(value){
            if (value < 0)
                return
            field = value
        }
}


fun main() {

}