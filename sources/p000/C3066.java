package p000;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۦِؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3066 {

    /* JADX INFO: renamed from: ۥۣ */
    public final LinkedHashMap f10306;

    public C3066(int i) {
        switch (i) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                this.f10306 = new LinkedHashMap();
                break;
            default:
                this.f10306 = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public List m5662(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f10306;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (AbstractC3831.m6874(((C1860) entry.getKey()).f6202, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((C1860) it.next());
        }
        return AbstractC0973.m2039(linkedHashMap.values());
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C2666 m5663(C1860 c1860) {
        return (C2666) this.f10306.remove(c1860);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m5664(AbstractC4383 abstractC4383) {
        int i = abstractC4383.f14450;
        int i2 = abstractC4383.f14449;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f10306;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + abstractC4383);
        }
        treeMap2.put(Integer.valueOf(i2), abstractC4383);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public C2666 m5665(C1860 c1860) {
        LinkedHashMap linkedHashMap = this.f10306;
        Object c2666 = linkedHashMap.get(c1860);
        if (c2666 == null) {
            c2666 = new C2666(c1860);
            linkedHashMap.put(c1860, c2666);
        }
        return (C2666) c2666;
    }

    public C3066(C5311 c5311) {
        this.f10306 = new LinkedHashMap(c5311.f17489);
    }
}
