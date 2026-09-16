package p000;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦۘؒۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5009 implements Serializable {

    /* JADX INFO: renamed from: ۦۨ */
    public final Pattern f16581;

    public C5009(String str) {
        this.f16581 = Pattern.compile(str);
    }

    public final String toString() {
        return this.f16581.toString();
    }
}
