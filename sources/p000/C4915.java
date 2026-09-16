package p000;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۦَۖؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4915 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4482 f16215;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f16216;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4915(C4482 c4482, int i) {
        super(0);
        this.f16216 = i;
        this.f16215 = c4482;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() throws IOException {
        switch (this.f16216) {
            case 0:
                return ((C1988) this.f16215.f14800.getValue()).f6561;
            default:
                C0365 c0365 = this.f16215.f14797;
                File canonicalFile = ((File) c0365.f1344.mo449()).getCanonicalFile();
                synchronized (C0365.f1342) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = C0365.f1343;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(absolutePath);
                }
                return new C1988(canonicalFile, c0365.f1346, (InterfaceC5823) c0365.f1345.mo211(canonicalFile), new C5285(6, canonicalFile));
        }
    }
}
