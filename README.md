
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>PCOO - MyPenelopeF</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.5.0/styles/monokai-sublime.min.css">
		<link rel="stylesheet" href="https://intra.etna-alternance.net/css/sujet-html-prep-new.css">
	</head>
	<body>

    <!-- Paramètres du projet -->
		<div class="panel panel-primary">
			<div class="panel-heading">
				<i class="fa fa-cogs"></i>
				<h2>PCOO - MyPenelopeF</h2>
			</div>
			<div class="panel-body">
				<ul>
					<li>Rendu SVN : https://rendu-svn.etna-alternance.net/v2/2019_Master - Mars_IDV-PCOO_9_0-2873/MyPenelopeF/thomas_s</li>
          <li>Objectif du Projet :</li>
          <ul>
            <li>- Faire un beau modèle objet qui sera évolutif</li>
            <li>- Mettre en place des design patterns</li>
            <li>- Etre en mesure d?identifier une problématique et d?en définir une architecture logicielle pour y répondre</li>
          </ul>
				</ul>
			</div>
		</div>

    <!-- Descriptions du projet -->
		<div class="panel panel-project">
			<div class="panel-heading">
				<i class="fa fa-book"></i>
				<h2>Description du projet</h2>
			</div>
			<div class="panel-body">
        <p>Vous venez d?arriver dans une jeune startup dont le directeur n?est pas technique, mais un super commercial avec 200 idées à la minute pour son produit.</p>
        <p>Pendant l?entretien, il vous présente un peu son idée :</p>
        <p> Mon projet c?est un gestionnaire de tâches qui permettrait de gérer toutes les tâches d?une entreprise de la même façon ! Que ce soit un document, un projet, un collaborateur, un groupe, etc. Je veux qu?on puisse générer des projets, y associer des groupes d?utilisateurs, des documents et tout gérer depuis l?application. Un peu comme un ERP, mais en mode gestion de projet. Car mon comptable a déjà son logiciel, mais à terme, ça serait super qu?on puisse s?interfacer avec son logiciel et que ça remplisse automatiquement un projet compta et tout ! Bien sûr avec des wizard pour que ça puisse être simple pour le client !</p>
        <p>Avec un projet structuré comme ça, vous prenez peur et vous lui avez indiqué que vous n?arriviez pas à voir où il voulait en venir ou même comment faire ce projet. Ce à quoi il vous a répondu :</p>
        <p>Ok, J?ai un pote CTO qui va venir te faire une près technique, car il connait le produit duquel je me suis inspiré et avait quelques idées pour la réalisation, mais pas trop le temps de le faire</p>
        <p>Quelques jours plus tard, le CTO vient vous présenter son idée :</p>
        <p>Salut, le projet  doit être hyper flexible, il faut prendre beaucoup de recul. L?idée est de pouvoir traiter différents types d?éléments, des objets donc on pourrait dire.</p>
        <p>Rapidement, j?ai vu les éléments suivants :</p>
        <ul>
          <li>Contacts</li>
          <li>Groupes</li>
          <li>Documents</li>
          <li>Projet</li>
          <li>tâches (Todo)</li>
          <li>Messages</li>
          <li>Dashboard</li>
        </ul>
        <p>
          Comme on peut imaginer, certains objets ont des points communs, il y a surement moyen d?optimiser tout ça. Tu auras certainement d?autres objets moins réels à mettre en place, mais je te laisse gérer.
          Pour l?utilisation, on va être simple, une fenêtre qui indique les groupes utilisateurs et les projets pour commencer. Avec ajout / suppression dans chaque liste.
          Pour sauvegarder les Users au début t?embête pas, un CSV, un JSON ou autre ce que tu préfères en mode simple. Pour les projets, créer un dossier à la racine. Les utilisateurs sont des noobs. Du coup, juste dans le dossier du projet quand le mec colle un fichier, tu le détectes et tu l?indiques dans le dashboard / fiche du projet.
          Pour ajouter un utilisateur, tu fais un wizard, pour assigner un user dans un groupe, pas besoin c?est rapide :).  Pour la création d?un projet, idem : Wizard :) avec le nom le détail du projet, les groupes et/ou user associé, pouvoir mettre des tâches avant que le projet soit dispo.
        </p>
        <p>
          Pour les fichiers, si tu scannes le dossier toutes les 30 secondes ça sera bien suffisant.
          Du coup, dans le dashboard, tu affiches tous les évents qui se sont produits dans ce projet. On peut ajouter des messages sur le dashboard, sur un todo, sur un doc, sur un user, sur un groupe, en gros sur tout quoi.
        </p>
        <p>
          Si tu as besoin d?aide, n?hésite pas à me faire un mail, je réponds vite. Pour le design t?embêtes pas, un truc simple, voir de la ligne de commande ça peut s?entendre, mais l?idée c?est d?avoir un POC et si ton modèle objet est bien fait, changer l?interface graphique sera trivial !
        </p>
        <p>
          Pour rappel, ce qu?on attend de toi ici c?est d?avoir une bonne archi objet et de savoir utiliser les bons design patterns. Ici j?en vois déjà 3/4 facilement mettable en place. Par contre, évite d?utiliser ceux du framework Java, on pourrait se catcher tous les 2. En cas de soucis, tu me fais un petit mail hein ?
        </p>
			</div>
		</div>

    <script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/ace/1.2.5/ace.js" type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.6.0/highlight.min.js"></script>
    <script>
      $(function() {
        // Highlight js
        $( "code" ).each( function( i, block ) {
          hljs.highlightBlock( block );
        });
        // Ace editor
        const ids = $( ".coding" );
            var jqPre = $( ".ace" );

        for ( var idi = 0; idi < ids.length; idi++ ) {
          var	id = ids[ idi ],
            editor = ace.edit( id ),
            jqEditor = $( id ),
            mode = jqEditor.attr( "data-mode" ),
            fontSize = 12,
            lineHeight = 16,
            lines = editor.session.getLength();
          ;

          // Settings for the editor
          editor.getSession().setMode( "ace/mode/" + mode );
          editor.setTheme( "ace/theme/monokai" );
          editor.setReadOnly( true );
          editor.setHighlightActiveLine( true );
          editor.setShowPrintMargin( false );

          // Set the div size
          jqEditor.css({
            "font-size": fontSize + "px",
            "line-height": lineHeight + "px",
            "height": ( lineHeight * lines ) + "px"
          });
        }
          jqPre.css( "background-color", "#272822" ) // Monokai theme background
      });
    </script>
  </body>
</html>

