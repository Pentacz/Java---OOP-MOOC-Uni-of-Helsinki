����   2 i
  > ?
  @	 
 A B C B D B E 7 F 7 G H B I
  J
  K
 
 >
 L M?�       N
 
 J
 
 K
 
 O
 
 P?�      
 
 Q?�      
  R othersThere Ljava/util/List; 	Signature #Ljava/util/List<Ldungeon/Vampire;>; <init> (II)V Code LineNumberTable LocalVariableTable this Ldungeon/Vampire; x I y move '(IILjava/util/List;Ldungeon/Position;)V one xLimit yLimit vampiresPosition player Ldungeon/Position; toss D LocalVariableTypeTable StackMapTable S :(IILjava/util/List<Ldungeon/Vampire;>;Ldungeon/Position;)V someoneAlreadyThere (Ldungeon/Position;)Z 
coordinate 
SourceFile Vampire.java ! " java/util/ArrayList ! T   U V W X T Y Z [ W \ ] dungeon/Vampire ^ _ ` a b a c d e dungeon/Position 9 : f " g " h _ java/util/Iterator ()V java/util/List isEmpty ()Z clear iterator ()Ljava/util/Iterator; hasNext next ()Ljava/lang/Object; add (Ljava/lang/Object;)Z getX ()I getY java/lang/Math random ()D setY setX equals ! 
                 ! "  #   X     *� *� Y� � �    $            %         & '      ( )     * )   + ,  #  �     �*� �  � *� �  -�  :�  � � 	 � 
:*� �  W���*� � 
Y� � � �  W� 9 �� $*� Y*� *� d� � � ~*� � u �� $*� Y*� d*� � � � T*� � K �� $*� Y*� *� `� � � **� � !*� Y*� `*� � � � 	*� �    $   N         3  ?  B  ]  b  k  �  �  �  �   � " � # � $ � ' � ( � + %   H  3  - '    � & '     � . )    � / )    � 0     � 1 2  b � 3 4  5       � 0    6    �  7� $� I))     8  9 :  #   �     ,*� �  M,�  � ,� 	 � N-+� � �����    $       .  / % 0 ' 2 * 3 %       
 - 2    , & '     , ; 2  6    � 
 7�   <    =