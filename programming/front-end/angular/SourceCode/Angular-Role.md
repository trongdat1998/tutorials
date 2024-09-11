# Bảo vệ routes sử dụng guards trong angular
## 1. Guard Types
- Có bốn loại guards khác nhau chúng ta có thể sử dụng để bảo về routes của mình:
	+ **CanActivate:** Quyết định việc một route được kich hoạt.
	+ CanActivateChild: Quyết định việc children routes được kich hoạt
	+ CanDeactivate: Quyết định việc một route hủy kích hoạt.
	+ CanLoad: Quyết định một module được lazy loading
	+ Resolve: 