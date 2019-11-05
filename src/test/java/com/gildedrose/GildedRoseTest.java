package com.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void decreaseQualityByOne() {
        Item[] items = new Item[] {
                new Item("normal", 10, 10),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(9);
    }

    @Test
    void decreaseSellInByOne() {
        Item[] items = new Item[] {
                new Item("normal", 20, 30),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn).isEqualTo(19);
    }

    @Test
    void decreaseQualityByTwo() {
        Item[] items = new Item[] {
                new Item("normal", -5, 10),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(8);
    }

    @Test
    void BrieIncreaseQualityByOne() {
        Item[] items = new Item[] {
                new Item("Aged Brie", -5, 5),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(7);
    }

    @Test
    void sulfurasKeepQuality() {
        Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", -5, 80),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(80);
    }

    @Test
    void keepSellIn() {
        Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", 10, 80),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn).isEqualTo(10);
    }

    @Test
    void backstageIncreaseQualityByTwo() {
        Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(12);
    }

    @Test
    void backstageIncreaseQualityByThree() {
        Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(13);
    }

    @Test
    void backstageQualityEqualToZero() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(0);
    }

    @Test
    void brieQualityIncreaseByOne() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(6);
    }

    @Test
    void brieQualityIncreaseByTwo() {
        Item[] items = new Item[] { new Item("Aged Brie", -5, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(7);
    }

    @Test
    void conjuredItemQualityDecreaseByTwo() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(8);
    }

    @Test
    void conjuredItemQualityDecreaseByFour() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(6);
    }



    @Test
    void itemQualityNeverBeNegative() {
        Item[] items = new Item[] { new Item("Conjured", 5, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(0);
    }

    @Test
    void winedecreaseQualityByOne() {
        Item[] items = new Item[] {
                new Item("Red red wine", -100, 100),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(99);
    }

    @Test
    void wineQualityIncreaseByOne() {
        Item[] items = new Item[] { new Item("Red red wine", 550, 100) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(101);
    }

    @Test
    void winekeepQuality() {
        Item[] items = new Item[] { new Item("Red red wine", 200, 100) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(100);
    }
}