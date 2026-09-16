package p000;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۡؕؔۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5469 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Serializable f18030;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC5360 f18031;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f18032;

    public C5469() {
        this.f18032 = 1;
        this.f18031 = new C3811();
        this.f18030 = new ArrayList();
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        int i = this.f18032;
        AbstractC5360 abstractC5360 = this.f18031;
        switch (i) {
            case 0:
                return (C1350) abstractC5360;
            default:
                return (C3811) abstractC5360;
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        switch (this.f18032) {
            case 0:
                return null;
            default:
                if (c1753.f5840 >= 4) {
                    return new C3714(-1, c1753.f5828 + 4, false);
                }
                if (c1753.f5832) {
                    return C3714.m6571(c1753.f5829);
                }
                return null;
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2294(CharSequence charSequence) {
        switch (this.f18032) {
            case 1:
                ((ArrayList) this.f18030).add(charSequence);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f A[LOOP:2: B:20:0x003b->B:22:0x003f, LOOP_END] */
    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۦؑ */
    public void mo2295() {
        int i;
        StringBuilder sb;
        int i2;
        switch (this.f18032) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f18030;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char cCharAt = charSequence.charAt(i2);
                                if (cCharAt != ' ') {
                                    switch (cCharAt) {
                                        case '\t':
                                        case '\n':
                                        case 11:
                                        case '\f':
                                        case '\r':
                                            break;
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                    }
                    sb = new StringBuilder();
                    for (i = 0; i < size + 1; i++) {
                        sb.append((CharSequence) arrayList.get(i));
                        sb.append('\n');
                    }
                    ((C3811) this.f18031).f12639 = sb.toString();
                    break;
                } while (i2 == -1);
                sb = new StringBuilder();
                while (i < size + 1) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((C3811) this.f18031).f12639 = sb.toString();
                break;
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۦۙ */
    public void mo3385(C5049 c5049) {
        switch (this.f18032) {
            case 0:
                c5049.m8565((String) this.f18030, (C1350) this.f18031);
                break;
        }
    }

    public C5469(int i, String str) {
        this.f18032 = 0;
        C1350 c1350 = new C1350();
        this.f18031 = c1350;
        c1350.f4640 = i;
        this.f18030 = str;
    }
}
