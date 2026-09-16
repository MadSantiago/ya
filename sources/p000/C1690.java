package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥۣٙٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1690 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f5637;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1690 f5635 = new C1690(0);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C1690 f5634 = new C1690(1);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1690 f5636 = new C1690(2);

    public C1690(int i) {
        this.f5637 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1690) {
            return this.f5637 == ((C1690) obj).f5637;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5637;
    }

    public final String toString() {
        int i = this.f5637;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return AbstractC5078.m8678(new StringBuilder("TextDecoration["), AbstractC0844.m1757(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
