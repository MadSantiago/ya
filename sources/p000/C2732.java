package p000;

/* JADX INFO: renamed from: ۥۥٌؓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2732 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f9042;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f9043;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f9044;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2732(int i, Object obj, Object obj2) {
        super(2);
        this.f9044 = i;
        this.f9042 = obj;
        this.f9043 = obj2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f9044;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f9043;
        Object obj4 = this.f9042;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C3129 c3129 = (C3129) obj2;
                ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316 = (ViewOnAttachStateChangeListenerC4316) obj3;
                if (!((C1900) obj4).f6281.m1028(c3129.f10473)) {
                    viewOnAttachStateChangeListenerC4316.m7615(iIntValue, c3129);
                    viewOnAttachStateChangeListenerC4316.f14272.mo5597(c2358);
                }
                break;
            case 1:
                C5362 c5362 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c5362.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5362.m8982();
                } else {
                    Boolean bool = (Boolean) ((C1325) obj4).f4581.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    InterfaceC5731 interfaceC5731 = (InterfaceC5731) obj3;
                    c5362.m9012(bool);
                    boolean zM9006 = c5362.m9006(zBooleanValue);
                    if (zBooleanValue) {
                        interfaceC5731.mo219(c5362, 0);
                    } else {
                        if (c5362.f17672 != 0) {
                            AbstractC5508.m9201("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!c5362.f17668) {
                            if (zM9006) {
                                C3222 c3222 = c5362.f17671;
                                int i2 = c3222.f10833;
                                int i3 = c3222.f10825;
                                C2024 c2024 = c5362.f17643;
                                c2024.getClass();
                                c2024.m3960(false);
                                ((C4773) c2024.f6671).f15736.m452(C2437.f8109);
                                AbstractC4489.m7805(c5362.f17647, i2, i3);
                                c5362.f17671.m5918();
                            } else {
                                c5362.m8970();
                            }
                        }
                    }
                    if (c5362.f17655 && c5362.f17671.f10831 == c5362.f17644) {
                        c5362.f17644 = -1;
                        c5362.f17655 = false;
                    }
                    c5362.m9009(false);
                }
                break;
            default:
                InterfaceC3212 interfaceC3212 = (InterfaceC3212) obj;
                C4893 c4893 = (C4893) obj2;
                AbstractC1311 abstractC1311 = (AbstractC1311) obj4;
                C0605 c0605 = abstractC1311.f4513;
                if (!c0605.m1342()) {
                    abstractC1311.f4533 = true;
                } else {
                    abstractC1311.f4512 = interfaceC3212;
                    abstractC1311.f4519 = c4893;
                    C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getSnapshotObserver();
                    C1117 c1117 = AbstractC1311.f4507;
                    snapshotObserver.f5926.m9077(abstractC1311, C3948.f13186, (C4739) obj3);
                    abstractC1311.f4533 = false;
                }
                break;
        }
        return c2358;
    }
}
