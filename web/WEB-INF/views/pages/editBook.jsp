
<form method="post" action="/edit">
    <div class="element">
        <label for="name">Name :</label>
        <input type="text" name="name" id="name" value="${book.name}" />
    </div>

    <div class="element">
        <label for="author">Author :</label>
        <input type="text" name="author" id="author" value="${book.author}" />
    </div>

    <div class="element">
        <label for="g">Genre :  </label>
        <select name="genre" id="g">
            <option value="">--Select A genre--</option>
            <option ${book.genre.equalsIgnoreCase("Romance")?"selected":""}>Romance</option>
            <option ${book.genre.equalsIgnoreCase("Horror")?"selected":""}>Horror</option>
            <option ${book.genre.equalsIgnoreCase("Sci-Fi")?"selected":""}>Sci-Fi</option>
            <option ${book.genre.equalsIgnoreCase("Drama")?"selected":""}>Drama</option>
            <option ${book.genre.equalsIgnoreCase("Fantasy")?"selected":""}>Fantasy</option>
            <option ${book.genre.equalsIgnoreCase("Technology")?"selected":""}>Technology</option>
        </select>
    </div>

    <div class="element">
        <label for="p">Price :</label>
        <input type="number" name="price" id="p"  value="${book.price}"/>
    </div>

    <div class="element">
        <label for="publi">Publication :</label>
        <input type="text" name="publication" id="publi"  value="${book.publication}"/>
    </div>

    <div class="element">
        <label for="isbn">ISBN :</label>
        <input type="number" name="isbn" id="isbn"  value="${book.isbnNo}"/>
    </div>

    <input type="hidden" value="${book.id}" name="id" />
    <div class="element">
        <input type="submit" value="Save" />
    </div>

</form>