from random import randint

tab = "abcdefghijklmnopqrstuvwxyz0123456789@ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def motdepasse(taille,caracteres):
    mdp=""
    for i in range(taille):
        mdp += caracteres[randint(0,len(caracteres))-1]
    return mdp

print(motdepasse(5,tab))