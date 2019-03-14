(function($){

    // alert("Bienvenue dans l'exercice de pagination!");

    $.fn.customPaginate = function(options){
        var paginationContainer = this;
        var itemsToPaginate;

        var defaults = {
            itemsPerPage : 5
        };

        var settings = {};

        $.extend(settings, defaults, options);

        itemsToPaginate = $(settings.itemsToPaginate);
        var numberOfPaginationLinks = Math.ceil((itemsToPaginate.length / settings.itemsPerPage));

        $("<ul></ul>").prependTo(paginationContainer);

        for(var index = 0; index < numberOfPaginationLinks; i++){

        }
    }

}(jQuery));