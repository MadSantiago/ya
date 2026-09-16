package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦّؖٚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4042 implements Appendable {

    /* JADX INFO: renamed from: ۥْ */
    public final ArrayList f13481;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f13482;

    /* JADX INFO: renamed from: ۦۨ */
    public final StringBuilder f13483;

    public C4042() {
        this.f13483 = new StringBuilder(16);
        this.f13482 = new ArrayList();
        this.f13481 = new ArrayList();
        new ArrayList();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof C1249;
        StringBuilder sb = this.f13483;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        C1249 c1249 = (C1249) charSequence;
        int length = sb.length();
        sb.append((CharSequence) c1249.f4307, i, i2);
        List listM9311 = AbstractC5556.m9311(c1249, i, i2, null);
        if (listM9311 != null) {
            int size = listM9311.size();
            for (int i3 = 0; i3 < size; i3++) {
                C2331 c2331 = (C2331) listM9311.get(i3);
                this.f13481.add(new C2181(c2331.f7718 + length, c2331.f7717 + length, c2331.f7719, c2331.f7720));
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C1249 m7241() {
        StringBuilder sb = this.f13483;
        String string = sb.toString();
        ArrayList arrayList = this.f13481;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C2181) arrayList.get(i)).m4236(sb.length()));
        }
        return new C1249(string, arrayList2);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7242(int i) {
        ArrayList arrayList = this.f13482;
        if (i >= arrayList.size()) {
            AbstractC3767.m6643(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                AbstractC3767.m6643("Nothing to pop.");
            }
            ((C2181) arrayList.remove(arrayList.size() - 1)).f7208 = this.f13483.length();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7243(C1249 c1249) {
        StringBuilder sb = this.f13483;
        int length = sb.length();
        sb.append(c1249.f4307);
        List list = c1249.f4308;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2331 c2331 = (C2331) list.get(i);
                this.f13481.add(new C2181(c2331.f7718 + length, c2331.f7717 + length, c2331.f7719, c2331.f7720));
            }
        }
    }

    public C4042(C1249 c1249) {
        this();
        m7243(c1249);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C1249) {
            m7243((C1249) charSequence);
            return this;
        }
        this.f13483.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f13483.append(c);
        return this;
    }
}
