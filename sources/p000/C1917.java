package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: ۥٍؚٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1917 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f6317;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f6316 = new ArrayList();

    /* JADX INFO: renamed from: ۥؗ */
    public final HashSet f6313 = new HashSet();

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f6318 = new ArrayList();

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayList f6314 = new ArrayList();

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f6315 = new ArrayList();

    public C1917(String str) {
        this.f6317 = str;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3751(C1917 c1917, String str, InterfaceC0103 interfaceC0103) {
        if (!c1917.f6313.add(str)) {
            C0178.m392("Element with name '", str, "' is already registered in ", c1917.f6317);
            return;
        }
        c1917.f6316.add(str);
        c1917.f6318.add(interfaceC0103);
        c1917.f6314.add(C2340.f7777);
        c1917.f6315.add(false);
    }
}
