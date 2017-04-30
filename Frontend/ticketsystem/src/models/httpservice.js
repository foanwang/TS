import fetch from 'isomorphic-fetch'

var baseUrl = "http://127.0.0.1:8000/";

  function get(url) {
        return fetch(baseUrl + url)
        .then(function(response) {
            return response.json();
        });
    }
   function post(url, ingredient){
       return fetch(baseUrl+ url, {
        method: "post",
        headers: {
         'Content-Type': 'application/json'
          },
          body: JSON.stringify(ingredient)
        }
      ).then(status)
       .then(function(response) {
	       return response;
      }).catch(function(error) {
          console.log('Request failed', error);
        });
  }

  function status(response) {
  if (response.status >= 200 && response.status < 300) {
    return Promise.resolve(response)
  } else {
    return Promise.reject(new Error(response.statusText))
  }
}

function json(response) {
  return response.json()
}

export {get, post};
