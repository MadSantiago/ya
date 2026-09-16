package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥؖؒؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0516 extends RuntimeException {

    /* JADX INFO: renamed from: ۦۨ */
    public final C4335 f1843;

    public C0516(C4335 c4335) {
        this.f1843 = c4335;
        if (c4335.f14311) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c4335.f14312;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C1470 c1470 = (C1470) list.get(i);
            if (!AbstractC0246.m520(iArr, c1470.f5005)) {
                if (c1470.f5005 == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((C1470) list.get(i3)).f5005 == 1000) {
                        break;
                    } else if (!arrayList.isEmpty()) {
                        arrayList.remove(AbstractC2164.m4181(arrayList));
                    }
                } else {
                    arrayList.add(c1470);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((C1470) arrayList.get(i4)).f5005, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        C4335 c4335 = this.f1843;
        if (!c4335.f14311) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        C3251 c3251M4189 = AbstractC2164.m4189();
        C5076 c5076 = new C5076(c4335.f14312);
        int iMo624 = c5076.mo624();
        for (int i = 0; i < iMo624; i++) {
            ((C1470) c5076.get(i)).getClass();
        }
        C5076 c5077 = new C5076(AbstractC2164.m4187(c3251M4189));
        int iMo625 = c5077.mo624();
        for (int i2 = 0; i2 < iMo625; i2++) {
            String str = (String) c5077.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
