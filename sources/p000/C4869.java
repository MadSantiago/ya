package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦٟؖۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4869 extends AbstractC0001 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C0588 f16032;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16033;

    public /* synthetic */ C4869(C0588 c0588, int i) {
        this.f16033 = i;
        this.f16032 = c0588;
    }

    @Override // p000.AbstractC0096, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f16033;
        C0588 c0588 = this.f16032;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = c0588.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && c0588.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return c0588.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f16033;
        C0588 c0588 = this.f16032;
        switch (i) {
            case 0:
                C1205 c1205 = c0588.f2193;
                AbstractC5848[] abstractC5848Arr = new AbstractC5848[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    abstractC5848Arr[i2] = new C2939(0);
                }
                return new C0813(c1205, abstractC5848Arr);
            default:
                C1205 c1206 = c0588.f2193;
                AbstractC5848[] abstractC5848Arr2 = new AbstractC5848[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    abstractC5848Arr2[i3] = new C2939(1);
                }
                return new C0813(c1206, abstractC5848Arr2);
        }
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        int i = this.f16033;
        C0588 c0588 = this.f16032;
        switch (i) {
            case 0:
                break;
        }
        return c0588.f2192;
    }
}
