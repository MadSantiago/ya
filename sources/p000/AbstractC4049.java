package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ۦُّؗؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4049 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final AbstractC2306 f13495;

    static {
        AbstractC2306 abstractC2306;
        try {
            abstractC2306 = AbstractC0145.f580;
        } catch (NoClassDefFoundError unused) {
            abstractC2306 = null;
        }
        if (abstractC2306 == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = AbstractC2306.f7641[i];
                try {
                    abstractC2306 = (AbstractC2306) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        f13495 = abstractC2306;
    }
}
