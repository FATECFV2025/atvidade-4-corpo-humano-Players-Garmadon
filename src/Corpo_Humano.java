public class Corpo_Humano
{
    // As variáveis devem estar públicas para serem usadas fora da classe
    public float Massa;
    public float Volume;
    public float Densidade;
    public float Altura;
    private float IMC;

    public Corpo_Humano(float Massa, float Volume, float Densidade, float Altura)
    {
        this.Massa = Massa;
        this.Volume = Volume;
        this.Densidade = Densidade;
        this.Altura = Altura;
    }

    public float getMassa()
    {
        return Massa;
    }
    public void setMassa(float massa)
    {
        this.Massa = massa;
    }

    public float getVolume()
    {
        return Volume;
    }
    // Um setter deve estar público para ser aplicado em outras classes
    public void setVolume(float volume)
    {
        this.Volume = volume;
    }

    public float getDensidade()
    {
        return Densidade;
    }
    public void setDensidade(float densidade)
    {
        this.Densidade = densidade;
    }

    // Desafio IMC
    public float getAltura()
    {
        return Altura;
    }
    public void setAltura(float altura)
    {
        this.Altura = altura;
    }

    public float calculoIMC()
    {
        return IMC = Massa / (Altura*Altura);
    }
}
