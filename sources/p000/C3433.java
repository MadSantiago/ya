package p000;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦْؗؖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3433 extends AbstractC2978 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f11396;

    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC4473 f11397;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f11398;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11399;

    public /* synthetic */ C3433(Object obj, long j, InterfaceC4473 interfaceC4473, int i) {
        this.f11399 = i;
        this.f11396 = obj;
        this.f11398 = j;
        this.f11397 = interfaceC4473;
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۥۗ */
    public final C0822 mo3795() {
        int i = this.f11399;
        Object obj = this.f11396;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = C0822.f2914;
                try {
                    return AbstractC5378.m9040(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (C0822) obj;
        }
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo3796() {
        switch (this.f11399) {
            case 0:
                break;
        }
        return this.f11398;
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC4473 mo3797() {
        int i = this.f11399;
        InterfaceC4473 interfaceC4473 = this.f11397;
        switch (i) {
            case 0:
                return (C4162) interfaceC4473;
            default:
                return (C1270) interfaceC4473;
        }
    }
}
