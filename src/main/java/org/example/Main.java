package org.example;

import party.iroiro.luajava.Lua;
import party.iroiro.luajava.lua54.Lua54;

public class Main {
    public static void main(String[] args) {
       try (Lua lua = new Lua54()) {
           lua.openLibraries();
           lua.run("System = java.import('java.lang.System')");
           lua.run("System.out:println('Hello World from Lua!')");
       }
    }
}