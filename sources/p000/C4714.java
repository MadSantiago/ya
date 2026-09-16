package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦؘُٜٟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4714 implements Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦۨ */
    public final String[] f15544;

    public C4714(String[] strArr) {
        this.f15544 = strArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4714) {
            return Arrays.equals(this.f15544, ((C4714) obj).f15544);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15544);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C3869[] c3869Arr = new C3869[size];
        for (int i = 0; i < size; i++) {
            c3869Arr[i] = new C3869(m8049(i), m8047(i));
        }
        return new C0084(1, c3869Arr);
    }

    public final int size() {
        return this.f15544.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM8049 = m8049(i);
            String strM8047 = m8047(i);
            sb.append(strM8049);
            sb.append(": ");
            if (AbstractC4031.m7223(strM8049)) {
                strM8047 = "██";
            }
            sb.append(strM8047);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C5086 m8046() {
        C5086 c5086 = new C5086(24);
        ((ArrayList) c5086.f16877).addAll(Arrays.asList(this.f15544));
        return c5086;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final String m8047(int i) {
        return this.f15544[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final String m8048(String str) {
        String[] strArr = this.f15544;
        int length = strArr.length - 2;
        int iM8638 = C5063.m8638(length, 0, -2);
        if (iM8638 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM8638) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final String m8049(int i) {
        return this.f15544[i * 2];
    }
}
