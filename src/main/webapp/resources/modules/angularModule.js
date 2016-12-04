(function(){

  var app = angular.module('store', [ ]);

  app.controller('StoreController', function(){
    this.products = gems;
  });

  var gems = [
    {
      name: 'Dodecahedron',
      price: 2.95,
      description: '#213423434',
      canPurchase: true,
      soldOut: false
    },
    {
      name: 'Pentagonal Gem',
      price: 5.95,
      description: '#234897345',
      canPurchase: true,
      soldOut: false
    },
    {
      name: 'Hexagonal Gem',
      price: 4.95,
      description: '#293482930',
      canPurchase: true,
      soldOut: false
    }
  ];

})();