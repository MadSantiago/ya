package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۦؙٖٗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4377 implements InterfaceC4089 {

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC5212 f14426;

    static {
        C2955 c2955 = C2955.f9912;
        int i = AbstractC5529.f18251;
    }

    public C4377(AbstractC5212 abstractC5212) {
        this.f14426 = abstractC5212;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC5212 m7675(InputStream inputStream, C2955 c2955) throws C5463 {
        AbstractC4650 abstractC4650M8025 = AbstractC4650.m8025(inputStream, 4096);
        int i = AbstractC5212.zzd;
        AbstractC5212 abstractC5212M8831 = this.f14426.m8831();
        try {
            InterfaceC0759 interfaceC0759M8330 = C4946.f16366.m8330(abstractC5212M8831.getClass());
            C4902 c4902 = (C4902) abstractC4650M8025.f15337;
            if (c4902 == null) {
                c4902 = new C4902(abstractC4650M8025);
            }
            interfaceC0759M8330.mo1655(abstractC5212M8831, c4902, c2955);
            interfaceC0759M8330.mo1654(abstractC5212M8831);
            abstractC4650M8025.mo4617(0);
            if (AbstractC5212.m8823(abstractC5212M8831, true)) {
                return abstractC5212M8831;
            }
            throw new C5515().m9202();
        } catch (C5463 e) {
            if (e.f18014) {
                throw new C5463(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C5463) {
                throw ((C5463) e2.getCause());
            }
            throw new C5463(e2.getMessage(), e2);
        } catch (C5515 e3) {
            throw e3.m9202();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C5463) {
                throw ((C5463) e4.getCause());
            }
            throw e4;
        }
    }
}
