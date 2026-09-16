package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥٍؒٚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0939 implements Iterator {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f3336;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f3337 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3338;

    public /* synthetic */ C0939(int i, Object obj) {
        this.f3338 = i;
        this.f3336 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3338;
        Object obj = this.f3336;
        switch (i) {
            case 0:
                return this.f3337 < ((C2485) obj).f8277.length();
            case 1:
                return this.f3337 < ((C2485) obj).f8277.length();
            default:
                return this.f3337 < ((C1173) obj).m2495();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.f3338;
        Object obj = this.f3336;
        switch (i) {
            case 0:
                String str = ((C2485) obj).f8277;
                int i2 = this.f3337;
                if (i2 < str.length()) {
                    this.f3337 = i2 + 1;
                    return new C2485(String.valueOf(i2));
                }
                C0178.m381();
                return null;
            case 1:
                String str2 = ((C2485) obj).f8277;
                int i3 = this.f3337;
                if (i3 < str2.length()) {
                    this.f3337 = i3 + 1;
                    return new C2485(String.valueOf(str2.charAt(i3)));
                }
                C0178.m381();
                return null;
            default:
                C1173 c1173 = (C1173) obj;
                int i4 = this.f3337;
                int iM2495 = c1173.m2495();
                int i5 = this.f3337;
                if (i4 < iM2495) {
                    this.f3337 = i5 + 1;
                    return c1173.m2496(i5);
                }
                C0178.m384(AbstractC5078.m8673(i5, "Out of bounds index: ", new StringBuilder(String.valueOf(i5).length() + 21)));
                return null;
        }
    }
}
