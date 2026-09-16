package p000;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: ۦٕٝؗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4766 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0114 f15717;

    public AbstractC4766(C0114 c0114) {
        this.f15717 = c0114;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public abstract Object mo4355(C1414 c1414);

    /* JADX INFO: renamed from: ۥۣ */
    public Object mo4356(C1414 c1414) throws C3754 {
        Iterable iterableAsList;
        C3223 c3223 = (C3223) c1414.f4871;
        StringBuilder sb = new StringBuilder("| (+) '");
        C0114 c0114 = this.f15717;
        sb.append(c0114);
        sb.append('\'');
        c3223.m5948(sb.toString());
        try {
            C0735 c0735 = (C0735) c1414.f4870;
            if (c0735 == null) {
                c0735 = new C0735(3, null);
            }
            return c0114.f454.mo219((C2354) c1414.f4868, c0735);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            int i = 0;
            while (i < stackTrace.length && !AbstractC0684.m1527(stackTrace[i].getClassName(), "sun.reflect", false)) {
                i++;
            }
            if (i != 0) {
                iterableAsList = i != 1 ? Arrays.asList(AbstractC0246.m514(stackTrace, 0, i)) : Collections.singletonList(stackTrace[0]);
            } else {
                iterableAsList = C2340.f7777;
            }
            sb2.append(AbstractC0973.m2056(iterableAsList, "\n\t", null, null, null, 62));
            c0114.toString();
            AbstractC3761.m6627(5, 4);
            throw new C3754("Could not create instance for '" + c0114 + '\'', e);
        }
    }
}
