package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ۥْؔؓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0390 implements InterfaceC5611 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f1447;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f1448;

    public C0390() {
        this.f1447 = new HashMap(2);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m903() {
        this.f1448 = false;
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m904(char c) {
        C0322 c0322 = (C0322) this.f1447;
        c0322.m701(c0322.f1179, 1);
        char[] cArr = (char[]) c0322.f1178;
        int i = c0322.f1179;
        c0322.f1179 = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: ۥّ */
    public void mo905(int i) {
        ((C0322) this.f1447).m686(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m906(AbstractC0881 abstractC0881) {
        HashMap map = (HashMap) this.f1447;
        for (String str : abstractC0881.mo1875()) {
            if (!map.containsKey(str)) {
                map.put(str, abstractC0881);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m907(String str) {
        ((C0322) this.f1447).m686(str);
    }

    @Override // p000.InterfaceC5611
    /* JADX INFO: renamed from: ۥۣ */
    public void mo908(C5270 c5270, int i) {
        StringBuilder sb = (StringBuilder) this.f1447;
        if (this.f1448) {
            this.f1448 = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void mo909(byte b) {
        ((C0322) this.f1447).m686(String.valueOf(b));
    }

    /* JADX INFO: renamed from: ۦِ */
    public void mo911(String str) {
        byte b;
        C0322 c0322 = (C0322) this.f1447;
        c0322.m701(c0322.f1179, str.length() + 2);
        char[] cArr = (char[]) c0322.f1178;
        int i = c0322.f1179;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = AbstractC0696.f2525;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c0322.m701(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = AbstractC0696.f2525;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c0322.f1178)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = AbstractC0696.f2526[cCharAt];
                        c0322.m701(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) c0322.f1178, i4);
                        int length3 = str2.length() + i4;
                        c0322.f1179 = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) c0322.f1178;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        c0322.f1179 = i4;
                    }
                }
                c0322.m701(i4, 1);
                ((char[]) c0322.f1178)[i4] = '\"';
                c0322.f1179 = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c0322.f1179 = i3 + 1;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void mo912(short s) {
        ((C0322) this.f1447).m686(String.valueOf(s));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void mo914(long j) {
        ((C0322) this.f1447).m686(String.valueOf(j));
    }

    public /* synthetic */ C0390(Object obj) {
        this.f1447 = obj;
        this.f1448 = true;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m910() {
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m913() {
    }
}
