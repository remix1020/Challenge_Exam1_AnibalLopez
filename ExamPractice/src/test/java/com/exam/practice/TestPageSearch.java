package com.exam.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestPageSearch {
	private static WebDriver driver;
	public static void main(String[] args) {System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apprater.net/add/");
		driver.findElement(By.xpath("//*[@id=\"usp_form\"]/div[3]/div[1]/fieldset/input")).sendKeys("Paulo");
		driver.findElement(By.xpath("//*[@id=\"usp_form\"]/div[3]/div[2]/fieldset/input")).sendKeys("Paulo123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"usp_form\"]/fieldset[1]/input")).sendKeys("Prisma Figura matemático");
		driver.findElement(By.xpath("//*[@id=\"usp_form\"]/div[4]/fieldset/input")).sendKeys("http://figuramatemáticoprisma");
		driver.findElement(By.xpath("//*[@id=\"usp_form\"]/fieldset[2]/textarea")).sendKeys("El prisma es una figura geométrica que fue muy utilizada en las culturas egipcias");	}}
