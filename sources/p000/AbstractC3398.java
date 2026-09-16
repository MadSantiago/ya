package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦٍؗؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3398 implements InterfaceC1620, Serializable {

    /* JADX INFO: renamed from: ۥَ */
    public final String f11305;

    /* JADX INFO: renamed from: ۥْ */
    public final Class f11306;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f11307;

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean f11308;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f11309;

    /* JADX INFO: renamed from: ۦۨ */
    public transient InterfaceC1620 f11310;

    public AbstractC3398(Object obj, Class cls, String str, String str2, boolean z) {
        this.f11309 = obj;
        this.f11306 = cls;
        this.f11307 = str;
        this.f11305 = str2;
        this.f11308 = z;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC2311 m6152() {
        boolean z = this.f11308;
        Class cls = this.f11306;
        if (!z) {
            return AbstractC5041.m8557(cls);
        }
        AbstractC5041.f16726.getClass();
        return new C2865(cls);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public abstract InterfaceC1620 mo486();
}
