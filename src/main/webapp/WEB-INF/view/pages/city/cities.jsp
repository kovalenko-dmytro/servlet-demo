<div class="row">
	<div class="col-sm-4">
		<div class="text-center mx-auto">
            <a href="${pageContext.request.contextPath}/cities" class="btn btn-success text-center">Create</a>
        </div>
	</div>
	<div class="col-sm-8">
        <table class="table">
          <thead>
            <tr>
              <th scope="col">City Name</th>
            </tr>
          </thead>
          <tbody>
            <c:if test = "${not empty cities}">
                <c:forEach var="city" items="${cities}">
                     <tr>
                         <td>${city.name}</td>
                     </tr>
                </c:forEach>
            </c:if>
          </tbody>
        </table>
    </div>
</div>