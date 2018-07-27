
<form method="post" action="/new">
    <div class="element">
        <label for="name">Name :</label>
        <input type="text" name="name" id="name" />
    </div>

    <div class="element">
        <label for="author">Author :</label>
        <input type="text" name="author" id="author" />
    </div>

    <div class="element">
        <label for="g">Genre :</label>
        <select name="genre" id="g">
            <option value="">--Select A genre--</option>
            <option>Romance</option>
            <option>Horror</option>
            <option>Sci-Fi</option>
            <option>Drama</option>
            <option>Fantasy</option>
            <option>Technology</option>
        </select>
    </div>

    <div class="element">
        <label for="p">Price :</label>
        <input type="number" name="price" id="p" />
    </div>

    <div class="element">
        <label for="publi">Publication :</label>
        <input type="text" name="publication" id="publi" />
    </div>

    <div class="element">
        <label for="isbn">ISBN :</label>
        <input type="number" name="isbn" id="isbn" />
    </div>


    <div class="element">
        <input type="submit" value="Save" />
    </div>

</form>